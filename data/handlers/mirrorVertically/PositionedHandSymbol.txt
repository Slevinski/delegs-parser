	public void mirrorVertically() {
		int newRotation = getSymbol().getRotation();

		if (newRotation <= 4) {
			newRotation += 12;
		} else if (newRotation <= 8) {
			newRotation += 4;
		} else if (newRotation <= 12) {
			newRotation -= 4;
		} else if (newRotation <= 16) {
			newRotation -= 12;
		}

		setFillAndRotation(getSymbol().getFill(), newRotation);
	}
