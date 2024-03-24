	public void mirror() {
		assert canMirror();

		int newRotation = getSymbol().getRotation();
		int newFill = getSymbol().getFill();

		if (getBaseSymbol().equals(BodyBaseSymbol.TORSO_CURVED_BLEND_WALL.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(BodyBaseSymbol.TORSO_TWIST_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			newRotation += 2;
			if (newRotation > 4) {
				newRotation -= 4;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.SHOULDER_HIP_POSITIONS.getIswaSymbol().getBaseSymbol())) {
			if (newFill == 1) {
				if (getSymbol().getRotation() == 1) {
					newRotation = 1;
				} else if (getSymbol().getRotation() == 2) {
					newRotation = 3;
				} else if (getSymbol().getRotation() == 3) {
					newRotation = 2;
				} else if (getSymbol().getRotation() == 4) {
					newRotation = 4;
				} else if (getSymbol().getRotation() == 5) {
					newRotation = 6;
				} else if (getSymbol().getRotation() == 6) {
					newRotation = 5;
				}
			} else if (newFill >= 2 && newFill <= 4) {
				if (getSymbol().getRotation() == 1) {
					newRotation = 4;
				} else if (getSymbol().getRotation() == 2) {
					newRotation = 6;
				} else if (getSymbol().getRotation() == 3) {
					newRotation = 5;
				} else if (getSymbol().getRotation() == 4) {
					newRotation = 1;
				} else if (getSymbol().getRotation() == 5) {
					newRotation = 3;
				} else if (getSymbol().getRotation() == 6) {
					newRotation = 2;
				}
			} else if (newFill == 5) {
				if (getSymbol().getRotation() == 1) {
					newRotation = 2;
				} else if (getSymbol().getRotation() == 2) {
					newRotation = 1;
				} else if (getSymbol().getRotation() == 3) {
					newRotation = 3;
				} else if (getSymbol().getRotation() == 4) {
					newRotation = 4;
				} else if (getSymbol().getRotation() == 5) {
					newRotation = 6;
				} else if (getSymbol().getRotation() == 6) {
					newRotation = 5;
				}
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.HEAD_WITH_SHOULDERS_OR_NOSE.getIswaSymbol().getBaseSymbol())
				&& newFill == 3) {
			if (getSymbol().getRotation() == 2) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 2;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.HEAD_WITH_SHOULDERS_OR_NOSE.getIswaSymbol().getBaseSymbol())
				&& newFill == 4) {
			if (getSymbol().getRotation() == 1) {
				newRotation = 3;
			} else if (getSymbol().getRotation() == 2) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 3) {
				newRotation = 1;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 2;
			}

		} else if (getBaseSymbol().equals(BodyBaseSymbol.BREATH_EXHALE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() % 2 == 1) {
				newFill = getSymbol().getFill() + 1;
			} else {
				newFill = getSymbol().getFill() - 1;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.BREATH_INHALE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() % 2 == 1) {
				newFill = getSymbol().getFill() + 1;
			} else {
				newFill = getSymbol().getFill() - 1;
			}
		} else {
			newRotation += 8;
			if (newRotation > 16) {
				newRotation -= 16;
			}
		}
		setFillAndRotation(newFill, newRotation);
	}
