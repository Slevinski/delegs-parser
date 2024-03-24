	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int maxRotations = DynamicsBaseSymbol.getDynamicsBaseSymbol(getSymbol().getBaseSymbol())
				.getValidRotationValues().size();
		int unmirroredRotations = canMirror()
				&& DynamicsBaseSymbol.getDynamicsBaseSymbol(getSymbol().getBaseSymbol()).getValidFills().contains(4)
						? maxRotations / 2 : maxRotations;

		boolean isMirrored = getSymbol().getRotation() > unmirroredRotations;

		int nextRotation = getSymbol().getRotation() % unmirroredRotations + 1;

		if (isMirrored) {
			nextRotation += unmirroredRotations;
		}

		setFillAndRotation(getSymbol().getFill(), nextRotation);
	}
