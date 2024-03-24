	public void decrease() {
		assert canDecrease() : "Precondition failed: canDecrease()";

		setFillAndRotation(getSymbol().getFill() - 1, getSymbol().getRotation());
	}
