	public void increase() {
		assert canIncrease() : "Precondition failed: canIncrease()";

		setFillAndRotation(getSymbol().getFill() + 1, getSymbol().getRotation());
	}
