	public void switchArrowHead() {
		assert canSwitchArrowHead() : "Precondition failed: canSwitchArrowHead()";

		int newFill = (getSymbol().getFill() % 3) + 1;

		if ((getSymbol().getFill() > 3) && (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_SINGLE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol()
						.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol()
						.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_SINGLE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol()
						.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_DOUBLE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol()
						.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_SINGLE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol()
						.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol())
				|| (getBaseSymbol().equals(MovementBaseSymbol.CURVE_HITS_CEILING_SMALL.getIswaSymbol().getBaseSymbol())
						&& getSymbol().getFill() > 3)
				|| (getBaseSymbol().equals(MovementBaseSymbol.CURVE_HITS_CEILING_LARGE.getIswaSymbol().getBaseSymbol())
						&& getSymbol().getFill() > 3)
				|| (getBaseSymbol().equals(MovementBaseSymbol.CURVE_HITS_FLOOR_SMALL.getIswaSymbol().getBaseSymbol())
						&& getSymbol().getFill() > 3)
				|| (getBaseSymbol().equals(MovementBaseSymbol.CURVE_HITS_FLOOR_LARGE.getIswaSymbol().getBaseSymbol())
						&& getSymbol().getFill() > 3))) {
			newFill += 3;
		}

		setFillAndRotation(newFill, getSymbol().getRotation());

	}
