	public void rotateClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		if (getSymbol().getBaseSymbol()
				.equals(EyesBaseSymbol.EYEGAZE_STRAIGHT_WALL_ALTERNATE.getIswaSymbol().getBaseSymbol())) {
			getPreviousRotation();
		} else {
			if ((getSymbol().getBaseSymbol()
					.equals(EyesBaseSymbol.EYEGAZE_CURVED_WALL_PLANE.getIswaSymbol().getBaseSymbol())
					|| getSymbol().getBaseSymbol()
							.equals(EyesBaseSymbol.EYEGAZE_CURVED_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())
					|| getSymbol().getBaseSymbol()
							.equals(EyesBaseSymbol.EYEGAZE_CIRCLES_WALL_PLANE.getIswaSymbol().getBaseSymbol()))
					&& getSymbol().getRotation() > EyesBaseSymbol.getEyesBaseSymbol(getSymbol().getBaseSymbol())
							.getValidRotations().size() / 2) {
				getNextRotation();
			} else {
				getPreviousRotation();
			}
		}
	}
