	public void rotateClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int maxRotations = DynamicsBaseSymbol.getDynamicsBaseSymbol(getSymbol().getBaseSymbol())
				.getValidRotationValues().size();
		int unmirroredRotations = canMirror()
				&& DynamicsBaseSymbol.getDynamicsBaseSymbol(getSymbol().getBaseSymbol()).getValidFills().contains(4)
						? maxRotations / 2 : maxRotations;

		int nextRotation = getSymbol().getRotation() - 1;

		if (nextRotation < 1) {
			nextRotation = unmirroredRotations;
		} else if (nextRotation == unmirroredRotations) {
			nextRotation = maxRotations;
		}

		setFillAndRotation(getSymbol().getFill(), nextRotation);
	}
