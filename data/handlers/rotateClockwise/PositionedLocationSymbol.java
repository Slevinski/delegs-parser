	public void rotateClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int maxRotations = MovementBaseSymbol.getMovementBaseSymbol(getSymbol().getBaseSymbol())
				.getValidRotationValues().size();
		int unmirroredRotations = canMirror() ? maxRotations / 2 : maxRotations;
		boolean isMirrored = getSymbol().getRotation() > unmirroredRotations;

		int nextRotation = getSymbol().getRotation() % unmirroredRotations + 1;

		if (isMirrored) {
			nextRotation += unmirroredRotations;
		}

		setFillAndRotation(getSymbol().getFill(), nextRotation);
	}
