	public void mirror() {
		assert canMirror() : "Precondition failed: canMirrorHorizontal()";

		int newRotation = 0;
		if (getSymbol().getRotation() == 1) {
			newRotation = 4;
		} else if (getSymbol().getRotation() == 2) {
			newRotation = 3;
		} else if (getSymbol().getRotation() == 3) {
			newRotation = 2;
		} else if (getSymbol().getRotation() == 4) {
			newRotation = 1;
		}

		setFillAndRotation(getSymbol().getFill(), newRotation);
	}
