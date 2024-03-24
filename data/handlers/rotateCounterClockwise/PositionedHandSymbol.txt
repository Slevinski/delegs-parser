	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		if (isLeftHand()) {
			getPreviousRotation();
		} else {
			getNextRotation();
		}
	}
