	public void rotateClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int nextRotation = getSymbol().getRotation() - 1;
		int nextFill = getSymbol().getFill();

		if (getSymbol().getBaseSymbol().equals(MouthBaseSymbol.MOUTH_CORNERS.getIswaSymbol().getBaseSymbol())
				|| getSymbol().getBaseSymbol()
						.equals(MouthBaseSymbol.TEETH_BITE_LIPS.getIswaSymbol().getBaseSymbol())) {
			nextRotation = 1;
			nextFill++;

			if (nextFill == 7) {
				nextFill = 4;
			}
		} else {
			if (nextRotation == 0) {
				nextRotation = 8;
			}
		}

		setFillAndRotation(nextFill, nextRotation);
	}
