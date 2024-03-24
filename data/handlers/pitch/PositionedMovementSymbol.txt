	public void pitch() {
		assert canPitch() : "Precondition failed: canPitch()";

		int newFill = getSymbol().getFill();

		if (MovementBaseSymbol.SURFACE_SYMBOLS
				.equals(MovementBaseSymbol.getMovementBaseSymbol(getSymbol().getBaseSymbol()))) {
			newFill = ((getSymbol().getFill()) % 2) + 1;
		} else if (MovementBaseSymbol.SURFACE_BETWEEN
				.equals(MovementBaseSymbol.getMovementBaseSymbol(getSymbol().getBaseSymbol()))) {
			newFill = ((getSymbol().getFill()) % 2) + 1;
		}

		setFillAndRotation(newFill, getSymbol().getRotation());
	}
