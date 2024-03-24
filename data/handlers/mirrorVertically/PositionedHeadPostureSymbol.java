	public void mirrorVertically() {
		assert canMirrorVertically() : "Precondition failed: canMirrorVertical()";

		int newRotation = getSymbol().getRotation();

		if (getSymbol().getBaseSymbol()
				.equals(HeadPostureBaseSymbol.HEAD_MOVEMENT_TILTS_WALL_PLANE.getIswaSymbol().getBaseSymbol())
				|| getSymbol().getBaseSymbol()
						.equals(HeadPostureBaseSymbol.FACE_DIRECTION_POSITIONS_NOSE_FORWARD_TILTING.getIswaSymbol()
								.getBaseSymbol())) {
			newRotation = (newRotation % 2) + 1;
		} else if (getSymbol().getBaseSymbol()
				.equals(HeadPostureBaseSymbol.HEAD_MOVEMENT_CURVES_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())
				|| getSymbol().getBaseSymbol().equals(
						HeadPostureBaseSymbol.HEAD_MOVEMENT_CURVES_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			newRotation = (newRotation + 2) % 4;
			if (newRotation == 0) {
				newRotation = 4;
			}
		} else if (getSymbol().getBaseSymbol()
				.equals(HeadPostureBaseSymbol.FACE_DIRECTION_POSITIONS_NOSE_UP_OR_DOWN_TILTING.getIswaSymbol()
						.getBaseSymbol())) {
			if (newRotation > 8) {
				newRotation = (newRotation + 8) % 16;
			} else {
				newRotation = (newRotation % 16) + 8;
			}
		} else if (getSymbol().getBaseSymbol()
				.equals(HeadPostureBaseSymbol.HEAD_MOVEMENT_CIRCLES.getIswaSymbol().getBaseSymbol())) {
			if (newRotation < 3) {
				newRotation = (newRotation % 2) + 1;
			} else {
				newRotation = ((newRotation - 2) % 2) + 3;
			}
		}

		setFillAndRotation(getSymbol().getFill(), newRotation);

	}
