	public void switchToNormalArrows() {
		assert canSwitchToNormalArrows() : "Precondition failed: canSwitchToNormalArrows()";

		setFillAndRotation(getSymbol().getFill() - 1, getSymbol().getRotation());
	}
