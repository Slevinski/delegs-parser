	public void increase() {
		assert canIncrease() : "Precondition failed: canIncrease()";

		int oldFillLeftEye = getSymbol().getFill();
		int oldRotationLeftEye = getSymbol().getRotation();

		if (getSymbol().getBaseSymbol()
				.equals(EyesBaseSymbol.EYEGAZE_STRAIGHT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			Symbol increasedSymbol = EyesBaseSymbol.EYEGAZE_STRAIGHT_WALL_DOUBLE.getIswaSymbol();
			setSymbol(increasedSymbol);
		} else if (getSymbol().getBaseSymbol()
				.equals(EyesBaseSymbol.EYEGAZE_STRAIGHT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			Symbol increasedSymbol = EyesBaseSymbol.EYEGAZE_STRAIGHT_FLOOR_DOUBLE.getIswaSymbol();
			setSymbol(increasedSymbol);
		}
		setFillAndRotation(oldFillLeftEye, oldRotationLeftEye);

	}
