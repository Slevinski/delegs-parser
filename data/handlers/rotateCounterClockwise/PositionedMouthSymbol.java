	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int nextRotation = getSymbol().getRotation() + 1;
		int nextFill = getSymbol().getFill();

		if (getSymbol().getBaseSymbol().equals(MouthBaseSymbol.MOUTH_CORNERS.getIswaSymbol().getBaseSymbol())
				|| getSymbol().getBaseSymbol()
						.equals(MouthBaseSymbol.TEETH_BITE_LIPS.getIswaSymbol().getBaseSymbol())) {
			nextRotation = 1;
			nextFill--;

			if (nextFill == 3) {
				nextFill = 6;
			}
		} else {
			if (nextRotation == 9) {
				nextRotation = 1;
			}

		}

		setFillAndRotation(nextFill, nextRotation);
	}
