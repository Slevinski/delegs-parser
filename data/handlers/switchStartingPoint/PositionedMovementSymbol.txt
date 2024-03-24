	public void switchStartingPoint() {
		assert canSwitchStartingPoint();

		int newFill = getSymbol().getFill();

		if (getSymbol().getFill() > 3) {
			newFill -= 3;
		} else {
			newFill += 3;
		}

		setFillAndRotation(newFill, getSymbol().getRotation());
	}
