	public void switchSize() {
		List<Symbol> allVariations = new ArrayList<Symbol>();
		int newFill = getSymbol().getFill();

		if (getBaseSymbol()
				.equals(MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BLEND_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BLEND_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BLEND_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BLEND_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BLEND_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BLEND_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CORNER_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CORNER_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CORNER_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CORNER_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CORNER_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CORNER_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CHECK_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CHECK_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CHECK_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CHECK_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CHECK_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CHECK_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BOX_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BOX_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BOX_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BOX_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BOX_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BOX_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.ZIGZAG_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ZIGZAG_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ZIGZAG_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ZIGZAG_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.ZIGZAG_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ZIGZAG_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.PEAKS_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.PEAKS_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.PEAKS_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.PEAKS_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.PEAKS_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.PEAKS_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_AWAY_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_TOWARDS_MOVEMENT_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_AWAY_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.DIAGONAL_BETWEEN_TOWARDS_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(
				MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.SINGLE_STRAIGHT_MOVEMENT_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CORNER_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CORNER_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CORNER_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CORNER_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CORNER_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CORNER_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BOX_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BOX_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BOX_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BOX_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.BOX_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.BOX_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ZIGZAG_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ZIGZAG_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ZIGZAG_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ZIGZAG_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ZIGZAG_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ZIGZAG_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.PEAKS_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.PEAKS_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.PEAKS_FLOOR_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.PEAKS_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.PEAKS_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.PEAKS_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_QUARTER_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_LARGEST.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_LARGEST.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_HALF_CIRCLE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_3_QUARTER_CIRCLE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_3_QUARTER_CIRCLE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_WALL_PLANE_3_QUARTER_CIRCLE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_WALL_PLANE_3_QUARTER_CIRCLE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.HUMP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.HUMP_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.HUMP_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.LOOP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.LOOP_WALL_PLANE_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.LOOP_WALL_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_WALL_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_WALL_PLANE_2_CURVES_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_WALL_PLANE_3_CURVES_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_WALL_PLANE_3_CURVES_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_WALL_PLANE_3_CURVES_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_WALL_PLANE_3_CURVES_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_WALL_PLANE_3_CURVES_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_WALL_PLANE_3_CURVES_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVED_CROSS_MOVEMENT_WALL_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVED_CROSS_MOVEMENT_WALL_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVED_CROSS_MOVEMENT_WALL_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVED_CROSS_MOVEMENT_WALL_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_DIAGONAL_PATH_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_DIAGONAL_PATH_MEDIUM.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_DIAGONAL_PATH_MEDIUM.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_DIAGONAL_PATH_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.WAVE_DIAGONAL_PATH_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_DIAGONAL_PATH_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_HITS_CEILING_SMALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() <= 3) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_CEILING_LARGE.getIswaSymbol().getBaseSymbol());
				newFill += 3;
			} else {
				allVariations = new ArrayList<Symbol>(validVariations);
				newFill -= 3;
			}
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_HITS_CEILING_LARGE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() <= 3) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_CEILING_SMALL.getIswaSymbol().getBaseSymbol());
				newFill += 3;
			} else {
				allVariations = new ArrayList<Symbol>(validVariations);
				newFill -= 3;
			}
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_CEILING_2_HUMPS_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_CEILING_2_HUMPS_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_CEILING_2_HUMPS_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_CEILING_2_HUMPS_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_CEILING_3_HUMPS_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_CEILING_3_HUMPS_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_CEILING_3_HUMPS_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_CEILING_3_HUMPS_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_CEILING_SMALL_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_CEILING_LARGE_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_CEILING_LARGE_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_CEILING_SMALL_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_CEILING_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_CEILING_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_CEILING_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_CEILING_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_HITS_CEILING_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_HITS_CEILING_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_HITS_CEILING_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_HITS_CEILING_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CURVE_HITS_FLOOR_SMALL.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() <= 3) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_FLOOR_LARGE.getIswaSymbol().getBaseSymbol());
				newFill += 3;
			} else {
				allVariations = new ArrayList<Symbol>(validVariations);
				newFill -= 3;
			}
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CURVE_HITS_FLOOR_LARGE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() <= 3) {
				allVariations = getAllVariationsForBaseSymbol(
						MovementBaseSymbol.CURVE_HITS_FLOOR_SMALL.getIswaSymbol().getBaseSymbol());
				newFill += 3;
			} else {
				allVariations = new ArrayList<Symbol>(validVariations);
				newFill -= 3;
			}
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_FLOOR_2_HUMPS_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_FLOOR_2_HUMPS_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_FLOOR_2_HUMPS_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_FLOOR_2_HUMPS_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_FLOOR_3_HUMPS_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_FLOOR_3_HUMPS_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.HUMP_HITS_FLOOR_3_HUMPS_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.HUMP_HITS_FLOOR_3_HUMPS_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_FLOOR_SMALL_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_FLOOR_LARGE_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_FLOOR_LARGE_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_FLOOR_SMALL_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_FLOOR_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_FLOOR_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.LOOP_HITS_FLOOR_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.LOOP_HITS_FLOOR_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_HITS_FLOOR_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_HITS_FLOOR_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_HITS_FLOOR_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_HITS_FLOOR_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CURVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_FLOOR_PLANE_MEDIUM_1.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_FLOOR_PLANE_MEDIUM_1.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_FLOOR_PLANE_MEDIUM_2.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.CURVE_FLOOR_PLANE_MEDIUM_2.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.CURVE_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.CURVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.WAVE_FLOOR_PLANE_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.WAVE_FLOOR_PLANE_SMALL.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_WALL_SMALL_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_WALL_MEDIUM_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_WALL_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_WALL_MEDIUM_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_WALL_MEDIUM_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_WALL_SMALL_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_WALL_MEDIUM_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_WALL_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_MEDIUM_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_SINGLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_SINGLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol()
				.equals(MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_LARGE_DOUBLE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARM_CIRCLE_HITS_WALL_SMALL_DOUBLE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.ARROWHEADS_SMALL.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARROWHEADS_LARGE.getIswaSymbol().getBaseSymbol());
		} else if (getBaseSymbol().equals(MovementBaseSymbol.ARROWHEADS_LARGE.getIswaSymbol().getBaseSymbol())) {
			allVariations = getAllVariationsForBaseSymbol(
					MovementBaseSymbol.ARROWHEADS_SMALL.getIswaSymbol().getBaseSymbol());
		}

		validVariations.clear();
		validVariations.addAll(allVariations);
		setFillAndRotation(newFill, getSymbol().getRotation());
	}
