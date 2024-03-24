	public void increase() {
		assert canIncrease();

		int newFill = getSymbol().getFill();

		if (getBaseSymbol().equals(BodyBaseSymbol.UPPER_BODY_TILTS.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(BodyBaseSymbol.SHOULDER_TILTS.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(BodyBaseSymbol.SHOULDER_HIP_MOVE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol()
						.equals(BodyBaseSymbol.SHOULDER_HIP_MOVE_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() == 1) {
				newFill = 2;
			} else if (getSymbol().getFill() == 2) {
				newFill = 4;
			} else if (getSymbol().getFill() == 3) {
				newFill = 5;
			}
		} else {
			newFill = 2;
		}

		setFillAndRotation(newFill, getSymbol().getRotation());
	}
