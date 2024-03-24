	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int nextRotation = getSymbol().getRotation();

		if (isMirrored()) {
			nextRotation = getPreviousRotation();
		} else {
			nextRotation = getNextRotation();
		}

		setFillAndRotation(getSymbol().getFill(), nextRotation);
	}
