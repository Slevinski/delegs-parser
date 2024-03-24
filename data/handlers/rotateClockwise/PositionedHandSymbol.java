	public void rotateClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		if (isLeftHand()) {
			getNextRotation();
		} else {
			getPreviousRotation();
		}
	}
