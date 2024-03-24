	public void rotateClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int nextRotation = getSymbol().getRotation();

		if (isMirrored()) {
			nextRotation = getNextRotation();
		} else {
			nextRotation = getPreviousRotation();
		}

		setFillAndRotation(getSymbol().getFill(), nextRotation);

	}
