	public void increase() {
		assert canIncrease() : "Precondition failed: canIncrease()";

		int newFill = this.getSymbol().getFill() + 2;

		setFillAndRotation(newFill, this.getSymbol().getRotation());
	}
