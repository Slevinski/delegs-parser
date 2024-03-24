	public void switchToNormalArrows() {
		List<Symbol> allVariations = new ArrayList<Symbol>();

		int rotation = getSymbol().getRotation();
		if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 5;
			} else if (rotation == 10) {
				rotation = 4;
			} else if (rotation == 11) {
				rotation = 3;
			} else if (rotation == 12) {
				rotation = 2;
			} else if (rotation == 13) {
				rotation = 1;
			} else if (rotation == 14) {
				rotation = 8;
			} else if (rotation == 15) {
				rotation = 7;
			} else if (rotation == 16) {
				rotation = 6;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 1;
			} else if (rotation == 10) {
				rotation = 8;
			} else if (rotation == 11) {
				rotation = 7;
			} else if (rotation == 12) {
				rotation = 6;
			} else if (rotation == 13) {
				rotation = 5;
			} else if (rotation == 14) {
				rotation = 4;
			} else if (rotation == 15) {
				rotation = 3;
			} else if (rotation == 16) {
				rotation = 2;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_ALTERNATING_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_STRAIGHT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 1;
			} else if (rotation == 10) {
				rotation = 8;
			} else if (rotation == 11) {
				rotation = 7;
			} else if (rotation == 12) {
				rotation = 6;
			} else if (rotation == 13) {
				rotation = 5;
			} else if (rotation == 14) {
				rotation = 4;
			} else if (rotation == 15) {
				rotation = 3;
			} else if (rotation == 16) {
				rotation = 2;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPLE_ALTERNATING_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPLE_WRIST_FLEX_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 1;
			} else if (rotation == 10) {
				rotation = 8;
			} else if (rotation == 11) {
				rotation = 7;
			} else if (rotation == 12) {
				rotation = 6;
			} else if (rotation == 13) {
				rotation = 5;
			} else if (rotation == 14) {
				rotation = 4;
			} else if (rotation == 15) {
				rotation = 3;
			} else if (rotation == 16) {
				rotation = 2;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol().equals(MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_FLOOR_PLANE_FILLED_ARROW
				.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_FLOOR_PLANE_FILLED_ARROW.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol().equals(MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_WALL_PLANE_FILLED_ARROW
				.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_WALL_PLANE_FILLED_ARROW.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		}

		else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 5;
			} else if (rotation == 10) {
				rotation = 4;
			} else if (rotation == 11) {
				rotation = 3;
			} else if (rotation == 12) {
				rotation = 2;
			} else if (rotation == 13) {
				rotation = 1;
			} else if (rotation == 14) {
				rotation = 8;
			} else if (rotation == 15) {
				rotation = 7;
			} else if (rotation == 16) {
				rotation = 6;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DOUBLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DOUBLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 1;
			} else if (rotation == 10) {
				rotation = 8;
			} else if (rotation == 11) {
				rotation = 7;
			} else if (rotation == 12) {
				rotation = 6;
			} else if (rotation == 13) {
				rotation = 5;
			} else if (rotation == 14) {
				rotation = 4;
			} else if (rotation == 15) {
				rotation = 3;
			} else if (rotation == 16) {
				rotation = 2;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_ALTERNATING_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_STRAIGHT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 1;
			} else if (rotation == 10) {
				rotation = 8;
			} else if (rotation == 11) {
				rotation = 7;
			} else if (rotation == 12) {
				rotation = 6;
			} else if (rotation == 13) {
				rotation = 5;
			} else if (rotation == 14) {
				rotation = 4;
			} else if (rotation == 15) {
				rotation = 3;
			} else if (rotation == 16) {
				rotation = 2;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRIPPLE_ALTERNATING_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRIPPLE_WRIST_FLEX_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			if (rotation == 9) {
				rotation = 1;
			} else if (rotation == 10) {
				rotation = 8;
			} else if (rotation == 11) {
				rotation = 7;
			} else if (rotation == 12) {
				rotation = 6;
			} else if (rotation == 13) {
				rotation = 5;
			} else if (rotation == 14) {
				rotation = 4;
			} else if (rotation == 15) {
				rotation = 3;
			} else if (rotation == 16) {
				rotation = 2;
			}

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.TRAVEL_ROTATION_ALTERNATING_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.TRAVEL_ROTATION_DOUBLE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_ALTERNATE_WALL_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_WALL_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_ALTERNATING_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_FLOOR_PLANE.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_ALTERNATING_HITS_CEILING.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_CEILING.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);

		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_ALTERNATING_HITS_FLOOR.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_FLOOR.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);

		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_ALTERNATING_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_FRONT_WALL.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ROTATION_ALTERNATIVE_HITS_CHEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ROTATION_DOUBLE_HITS_CHEST.getIswaSymbol().getBaseSymbol());

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), rotation);

		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_WALL_PLANE.getIswaSymbol().getBaseSymbol())
				|| getBaseSymbol().equals(
						MovementBaseSymbol.FINGER_CONTACT_MOVEMENT_FLOOR_PLANE.getIswaSymbol().getBaseSymbol())) {
			setFillAndRotation(getSymbol().getFill() - 1, getSymbol().getRotation());
		}
	}
