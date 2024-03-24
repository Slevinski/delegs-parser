	public void decrease() {
		assert canDecrease() : "Precondition failed: canDecrease()";

		int oldFill = getSymbol().getFill();
		int oldRotation = getSymbol().getRotation();

		Symbol decreasedSymbol = MouthBaseSymbol.MOUTH_WRINKLES_SINGLE.getIswaSymbol();
		setSymbol(decreasedSymbol);

		setFillAndRotation(oldFill, oldRotation);

	}
