	public void switchToAlternatingArrows() {
		List<Symbol> allVariations = new ArrayList<Symbol>();

		if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_FLOOR_PLANE_FILLED_ARROW.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_FLOOR_PLANE_FILLED_ARROW.getIswaSymbol()
							.getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_WALL_PLANE_FILLED_ARROW.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_WALL_PLANE_FILLED_ARROW.getIswaSymbol()
							.getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_DOUBLE_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_ALTERNATE_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_DOUBLE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_ALTERNATING_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_DOUBLE_HITS_CHEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_ALTERNATIVE_HITS_CHEST.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_DOUBLE_HITS_CEILING.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_ALTERNATING_HITS_CEILING.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_DOUBLE_HITS_FLOOR.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_ALTERNATING_HITS_FLOOR.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_DOUBLE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_ALTERNATING_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(
						MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			setFillAndRotation(getSymbol().getFill() + 1, getSymbol().getRotation());
		}

	}
