	public void decrease() {
		assert canDecrease() : "Precondition failed: canDecrease()";

		// decrease is a change in Rotation for HEAD_MOVEMENT_CIRCLES
		if (HeadPostureBaseSymbol.HEAD_MOVEMENT_CIRCLES.getIswaSymbol().getBaseSymbol()
				.equals(getSymbol().getBaseSymbol())) {
			int newRotation = getSymbol().getRotation() - 2;
			setFillAndRotation(getSymbol().getFill(), newRotation);
		} else {

			int newFill = getSymbol().getFill() - 1;

			if ((HeadPostureBaseSymbol.HEAD_MOVEMENT_STRAIGHT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol()
					.equals(getSymbol().getBaseSymbol())
					|| HeadPostureBaseSymbol.HEAD_MOVEMENT_STRAIGHT_WALL_PLANE.getIswaSymbol().getBaseSymbol()
							.equals(getSymbol().getBaseSymbol()))
					&& newFill == 3) {
				newFill = 2;
			}

			setFillAndRotation(newFill, getSymbol().getRotation());

		}

	}
