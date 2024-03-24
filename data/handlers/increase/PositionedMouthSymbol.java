	public void increase() {
		assert canIncrease() : "Precondition failed: canIncrease()";

		int oldFill = getSymbol().getFill();
		int oldRotation = getSymbol().getRotation();

		Symbol increasedSymbol = MouthBaseSymbol.MOUTH_WRINKLES_DOUBLE.getIswaSymbol();
		setSymbol(increasedSymbol);

		setFillAndRotation(oldFill, oldRotation);
	}
