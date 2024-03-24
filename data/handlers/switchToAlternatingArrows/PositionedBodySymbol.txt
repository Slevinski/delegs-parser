	public void switchToAlternatingArrows() {
		assert canSwitchToAlternatingArrows() : "Precondition failed: canSwitchToAlternatingArrows()";

		setFillAndRotation(getSymbol().getFill() + 1, getSymbol().getRotation());
	}
