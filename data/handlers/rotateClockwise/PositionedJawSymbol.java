	public void rotateClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		if (!getSymbol().equals(Symbol.JAW_PART_HEAD_RIM)) {
			int newRotation = getSymbol().getRotation() - 1;

			if (newRotation == 0) {
				newRotation = 8;
			}

			setFillAndRotation(getSymbol().getFill(), newRotation);
		}
	}
