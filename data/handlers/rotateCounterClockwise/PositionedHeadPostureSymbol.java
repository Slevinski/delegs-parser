	public void rotateCounterClockwise() {
		assert canRotate() : "Precondition failed: canRotate()";

		int newFill = getSymbol().getFill();
		int newRotation = getNextRotation();

		if (getSymbol().getBaseSymbol().equals(
				HeadPostureBaseSymbol.TONGUE_MOVES_AGAINST_CHEEK_CHEEK_ITSELF.getIswaSymbol().getBaseSymbol())) {
			if (newRotation > 5 && getSymbol().getRotation() <= 5) {
				newRotation = 1;
			} else if (getSymbol().getFill() == 1 && getSymbol().getRotation() == 8) {
				newFill = 2;
				newRotation = getSymbol().getRotation();
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() == 6) {
				newFill = 1;
				newRotation = getSymbol().getRotation();
			} else if (getSymbol().getFill() == 2 && getSymbol().getRotation() > 5) {
				newRotation = getPreviousRotation();
			}
		}
		if (getSymbol().getBaseSymbol().equals(
				HeadPostureBaseSymbol.FACE_DIRECTION_POSITIONS_NOSE_UP_OR_DOWN_TILTING.getIswaSymbol().getBaseSymbol())
				&& getSymbol().getRotation() > 8) {
			newRotation = getPreviousRotation();
		}

		setFillAndRotation(newFill, newRotation);
	}
