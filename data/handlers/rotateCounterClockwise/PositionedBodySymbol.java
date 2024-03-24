	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int nextRotation = getSymbol().getRotation();
		int nextFill = getSymbol().getFill();

		if (getBaseSymbol().equals(BodyBaseSymbol.TORSO_STRAIGHT_STRETCH_WALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 1) {
				nextRotation = 2;
			} else if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 2) {
				nextFill = 2;
				nextRotation = 4;
			} else if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 3) {
				nextFill = 2;
				nextRotation = 2;
			} else if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 4) {
				nextRotation = 1;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 2) {
				nextFill = 1;
				nextRotation = 4;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 4) {
				nextFill = 1;
				nextRotation = 3;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 1) {
				nextRotation = 3;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 3) {
				nextRotation = 1;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.TORSO_CURVED_BLEND_WALL.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(BodyBaseSymbol.TORSO_TWIST_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 1) {
				nextFill = 2;
				nextRotation = 2;
			} else if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 2) {
				nextRotation = 1;
			} else if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 3) {
				nextRotation = 4;
			} else if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 4) {
				nextFill = 2;
				nextRotation = 1;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 1) {
				nextRotation = 4;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 2) {
				nextRotation = 3;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 3) {
				nextFill = 1;
				nextRotation = 2;
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 4) {
				nextFill = 1;
				nextRotation = 3;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.SHOULDER_HIP_POSITIONS.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() == 1) {
				if (getSymbol().getRotation() == 1) {
					nextRotation = 2;
				} else if (getSymbol().getRotation() == 2) {
					nextRotation = 6;
				} else if (getSymbol().getRotation() == 3) {
					nextRotation = 1;
				} else if (getSymbol().getRotation() == 4) {
					nextRotation = 5;
				} else if (getSymbol().getRotation() == 5) {
					nextRotation = 3;
				} else if (getSymbol().getRotation() == 6) {
					nextRotation = 4;
				}
			} else if (getSymbol().getFill() == 2) {
				if (getSymbol().getRotation() == 1) {
					nextRotation = 2;
				} else if (getSymbol().getRotation() == 2) {
					nextFill = 3;
					nextRotation = 6;
				} else if (getSymbol().getRotation() == 3) {
					nextRotation = 1;
				} else if (getSymbol().getRotation() == 4) {
					nextRotation = 5;
				} else if (getSymbol().getRotation() == 5) {
					nextFill = 3;
					nextRotation = 3;
				} else if (getSymbol().getRotation() == 6) {
					nextRotation = 4;
				}
			} else if (getSymbol().getFill() == 3) {
				if (getSymbol().getRotation() == 1) {
					nextRotation = 2;
				} else if (getSymbol().getRotation() == 2) {
					nextFill = 2;
					nextRotation = 6;
				} else if (getSymbol().getRotation() == 3) {
					nextRotation = 1;
				} else if (getSymbol().getRotation() == 4) {
					nextRotation = 5;
				} else if (getSymbol().getRotation() == 5) {
					nextFill = 2;
					nextRotation = 3;
				} else if (getSymbol().getRotation() == 6) {
					nextRotation = 4;
				}
			} else if (getSymbol().getFill() == 4) {
				if (getSymbol().getRotation() == 1) {
					nextRotation = 2;
				} else if (getSymbol().getRotation() == 2) {
					nextRotation = 3;
				} else if (getSymbol().getRotation() == 3) {
					nextRotation = 1;
				} else if (getSymbol().getRotation() == 4) {
					nextRotation = 5;
				} else if (getSymbol().getRotation() == 5) {
					nextRotation = 6;
				} else if (getSymbol().getRotation() == 6) {
					nextRotation = 4;
				}
			} else if (getSymbol().getFill() == 5) {
				if (getSymbol().getRotation() == 3) {
					nextRotation = 5;
				} else if (getSymbol().getRotation() == 4) {
					nextRotation = 6;
				} else if (getSymbol().getRotation() == 5) {
					nextRotation = 4;
				} else if (getSymbol().getRotation() == 6) {
					nextRotation = 3;
				}
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.SHOULDER_HIP_SPINE.getIswaSymbol().getBaseSymbol())
				&& getSymbol().getFill() <= 2) {
			if (getSymbol().getRotation() == 1) {
				nextRotation = 2;
			} else if (getSymbol().getRotation() == 2) {
				nextRotation = 4;
			} else if (getSymbol().getRotation() == 4) {
				nextRotation = 1;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.HEAD_WITH_SHOULDERS_OR_NOSE.getIswaSymbol().getBaseSymbol())
				&& getSymbol().getFill() == 3) {
			if (getSymbol().getRotation() == 1) {
				nextRotation = 2;
			} else if (getSymbol().getRotation() == 2) {
				nextRotation = 3;
			} else if (getSymbol().getRotation() == 3) {
				nextRotation = 4;
			} else if (getSymbol().getRotation() == 4) {
				nextRotation = 1;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.HEAD_WITH_SHOULDERS_OR_NOSE.getIswaSymbol().getBaseSymbol())
				&& getSymbol().getFill() == 4) {
			if (getSymbol().getRotation() == 1) {
				nextRotation = 2;
			} else if (getSymbol().getRotation() == 2) {
				nextRotation = 4;
			} else if (getSymbol().getRotation() == 3) {
				nextRotation = 1;
			} else if (getSymbol().getRotation() == 4) {
				nextRotation = 3;
			}
		} else {
			if (isMirrored()) {
				nextRotation = getPreviousRotation();
			} else {
				nextRotation = getNextRotation();
			}
		}

		setFillAndRotation(nextFill, nextRotation);
	}
