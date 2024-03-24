	public void decrease() {
		assert canDecrease();

		int newFill = getSymbol().getFill();

		if (getBaseSymbol().equals(BodyBaseSymbol.UPPER_BODY_TILTS.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(BodyBaseSymbol.SHOULDER_TILTS.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(BodyBaseSymbol.SHOULDER_HIP_MOVE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol()
						.equals(BodyBaseSymbol.SHOULDER_HIP_MOVE_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() == 2) {
				newFill = 1;
			} else if (getSymbol().getFill() == 4) {
				newFill = 2;
			} else if (getSymbol().getFill() == 5) {
				newFill = 3;
			}
		} else {
			newFill = 1;
		}

		setFillAndRotation(newFill, getSymbol().getRotation());

	}
