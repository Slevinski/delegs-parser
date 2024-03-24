	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		if (!getSymbol().equals(Symbol.JAW_PART_HEAD_RIM)) {
			int newRotation = getSymbol().getRotation() + 1;

			if (newRotation == 9) {
				newRotation = 1;
			}

			setFillAndRotation(getSymbol().getFill(), newRotation);
		}
	}
