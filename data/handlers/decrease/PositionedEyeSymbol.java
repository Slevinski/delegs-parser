	public void decrease() {
		assert canDecrease() : "Precondition failed: canDecrease()";

		int oldFillLeftEye = getSymbol().getFill();
		int oldRotationLeftEye = getSymbol().getRotation();

		if (getSymbol().getBaseSymbol()
				.equals(EyesBaseSymbol.EYEGAZE_STRAIGHT_WALL_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			Symbol increasedSymbol = EyesBaseSymbol.EYEGAZE_STRAIGHT_WALL_PLANE.getIswaSymbol();
			setSymbol(increasedSymbol);
		} else if (getSymbol().getBaseSymbol()
				.equals(EyesBaseSymbol.EYEGAZE_STRAIGHT_FLOOR_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			Symbol increasedSymbol = EyesBaseSymbol.EYEGAZE_STRAIGHT_FLOOR_PLANE.getIswaSymbol();
			setSymbol(increasedSymbol);
		}
		setFillAndRotation(oldFillLeftEye, oldRotationLeftEye);
	}
