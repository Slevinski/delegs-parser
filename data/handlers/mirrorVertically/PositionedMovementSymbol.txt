	public void mirrorVertically() {
		assert canMirrorVertically() : "Precondition failed: canMirrorVertically()";

		int newFill = getSymbol().getFill();
		int newRotation = getSymbol().getRotation();

		if (getSymbol().getCategory() == 2 && getSymbol().getGroup() == 7) {
			if (getSymbol().getSymbol() <= 11) {
				newRotation = ((newRotation + 1) % 4) + 1;
			} else if (getSymbol().getSymbol() == 12) {
				if (newRotation == 1) {
					newRotation = 4;
				} else if (newRotation == 2) {
					newRotation = 3;
				} else if (newRotation == 3) {
					newRotation = 2;
				} else if (newRotation == 4) {
					newRotation = 1;
				}
			} else if (getSymbol().getSymbol() <= 15) {
				newRotation = ((newRotation + 1) % 4) + 1;
			} else if (getSymbol().getSymbol() > 15) {
				if (newRotation < 5) {
					newRotation += 12;
				} else if (newRotation < 9) {
					newRotation += 4;
				} else if (newRotation < 13) {
					newRotation -= 4;
				} else if (newRotation >= 13) {
					newRotation -= 12;
				}
			}
		} else if (getSymbol().getCategory() == 2 && getSymbol().getGroup() == 8) {
			if (newRotation == 1) {
				newRotation = 5;
			} else if (newRotation == 2) {
				newRotation = 6;
			} else if (newRotation == 3) {
				newRotation = 4;
			} else if (newRotation == 4) {
				newRotation = 3;
			} else if (newRotation == 5) {
				newRotation = 1;
			} else if (newRotation == 6) {
				newRotation = 2;
			} else if (newRotation == 7) {
				newRotation = 8;
			} else if (newRotation == 8) {
				newRotation = 7;
			}
		} else if (getMaxRotation() == 8) {
			if (newRotation == 1) {
				newRotation = 5;
			} else if (newRotation == 2) {
				newRotation = 4;
			} else if (newRotation == 4) {
				newRotation = 2;
			} else if (newRotation == 5) {
				newRotation = 1;
			} else if (newRotation == 6) {
				newRotation = 8;
			} else if (newRotation == 8) {
				newRotation = 6;
			}
		} else if (getMaxRotation() == 4) {
			if (newRotation == 2) {
				newRotation = 4;
			} else if (newRotation == 4) {
				newRotation = 2;
			}
		} else if (getMaxRotation() == 16) {
			if (newRotation == 1) {
				newRotation = 13;
			} else if (newRotation == 2) {
				newRotation = 14;
			} else if (newRotation == 3) {
				newRotation = 15;
			} else if (newRotation == 4) {
				newRotation = 16;
			} else if (newRotation == 5) {
				newRotation = 9;
			} else if (newRotation == 6) {
				newRotation = 10;
			} else if (newRotation == 7) {
				newRotation = 11;
			} else if (newRotation == 8) {
				newRotation = 12;
			} else if (newRotation == 9) {
				newRotation = 5;
			} else if (newRotation == 10) {
				newRotation = 6;
			} else if (newRotation == 11) {
				newRotation = 7;
			} else if (newRotation == 12) {
				newRotation = 8;
			} else if (newRotation == 13) {
				newRotation = 1;
			} else if (newRotation == 14) {
				newRotation = 2;
			} else if (newRotation == 15) {
				newRotation = 3;
			} else if (newRotation == 16) {
				newRotation = 4;
			}
		} else if (getMaxRotation() == 6) {
			if (newRotation == 1) {
				newRotation = 3;
			} else if (newRotation == 2) {
				newRotation = 4;
			} else if (newRotation == 3) {
				newRotation = 1;
			} else if (newRotation == 4) {
				newRotation = 2;
			} else if (newRotation == 5) {
				newRotation = 6;
			} else if (newRotation == 6) {
				newRotation = 5;
			}
		}
		setFillAndRotation(newFill, newRotation);
	}
