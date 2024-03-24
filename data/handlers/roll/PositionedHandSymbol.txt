	public void roll() {
		assert canRoll() : "Precondition failed: canRoll()";

		int maxFillInWallPlane = maxFill / 2;

		int nextFill = getSymbol().getFill() - 1;

		if (nextFill == 0) {
			// We are in wall plane
			nextFill = maxFillInWallPlane;
		} else if (nextFill == maxFillInWallPlane) {
			// We are in desktop plane
			nextFill = maxFill;
		}

		setFillAndRotation(nextFill, getSymbol().getRotation());
	}
