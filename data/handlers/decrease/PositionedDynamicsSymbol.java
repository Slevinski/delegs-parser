	public void decrease() {
		assert canDecrease() : "Precondition failed: canDecrease()";

		int newFill = this.getSymbol().getFill() - 2;

		setFillAndRotation(newFill, this.getSymbol().getRotation());
	}
