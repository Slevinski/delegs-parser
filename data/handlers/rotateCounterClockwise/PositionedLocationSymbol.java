	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int maxRotations = MovementBaseSymbol.getMovementBaseSymbol(getSymbol().getBaseSymbol())
				.getValidRotationValues().size();
		int unmirroredRotations = canMirror() ? maxRotations / 2 : maxRotations;

		int nextRotation = getSymbol().getRotation() - 1;

		if (nextRotation < 1) {
			nextRotation = unmirroredRotations;
		} else if (nextRotation == unmirroredRotations) {
			nextRotation = maxRotations;
		}

		setFillAndRotation(getSymbol().getFill(), nextRotation);
	}
