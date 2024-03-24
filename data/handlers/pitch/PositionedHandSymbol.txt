	public void pitch() {
		assert canPitch() : "Precondition failed: canPitch()";

		int newFill = (getSymbol().getFill() + (maxFill / 2) - 1) % maxFill + 1;

		setFillAndRotation(newFill, getSymbol().getRotation());
	}
