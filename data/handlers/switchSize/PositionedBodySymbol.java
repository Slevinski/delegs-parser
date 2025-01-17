	public void switchSize() {
		assert canSwitchSize() : "Precondition failed: canSwitchSize()";

		int newFill = getSymbol().getFill();
		int newRotation = getSymbol().getRotation();
		List<Symbol> allVariations = new ArrayList<Symbol>();

		if (getBaseSymbol().equals(BodyBaseSymbol.LIMB_LENGTH_1.getIswaSymbol().getBaseSymbol())) {
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 13, 32, 17));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 12, 30, 30));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 15, 32, 2));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 14, 32, 9));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 16, 32, 9));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 5, 32, 17));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 4, 30, 30));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 7, 32, 2));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 6, 32, 9));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 9, 2, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 8, 32, 9));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 11, 17, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 10, 9, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 1, 5, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 2, 12, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 3, 18, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 4, 30, 30));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 16, 32, 12));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 15, 32, 5));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 14, 32, 12));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 13, 32, 18));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 12, 30, 30));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 11, 18, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 10, 12, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 9, 5, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 8, 32, 12));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 7, 32, 5));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 6, 32, 12));
			allVariations.add(new Symbol(5, 2, 2, 2, 2, 5, 32, 18));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 2, 9, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 3, 17, 32));
			allVariations.add(new Symbol(5, 2, 2, 2, 1, 1, 2, 32));

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(BodyBaseSymbol.LIMB_LENGTH_2.getIswaSymbol().getBaseSymbol())) {
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 2, 11, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 1, 2, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 7, 40, 5));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 6, 40, 14));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 5, 40, 22));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 4, 38, 38));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 11, 22, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 3, 22, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 2, 14, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 10, 14, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 1, 5, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 9, 5, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 8, 40, 14));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 15, 40, 5));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 14, 40, 14));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 13, 40, 22));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 12, 38, 38));
			allVariations.add(new Symbol(5, 2, 2, 3, 2, 16, 40, 14));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 13, 40, 21));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 14, 40, 11));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 11, 21, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 12, 39, 39));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 15, 40, 2));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 16, 40, 11));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 5, 40, 21));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 6, 40, 11));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 3, 21, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 4, 39, 39));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 9, 2, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 10, 11, 40));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 7, 40, 2));
			allVariations.add(new Symbol(5, 2, 2, 3, 1, 8, 40, 11));

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(BodyBaseSymbol.LIMB_LENGTH_3.getIswaSymbol().getBaseSymbol())) {
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 9, 2, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 8, 48, 13));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 7, 48, 2));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 6, 48, 13));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 5, 48, 25));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 4, 47, 47));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 3, 25, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 2, 13, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 16, 48, 13));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 15, 48, 2));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 14, 48, 13));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 13, 48, 25));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 12, 47, 47));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 11, 25, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 10, 13, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 1, 5, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 2, 16, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 4, 45, 45));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 3, 25, 46));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 6, 48, 16));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 5, 46, 25));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 8, 48, 16));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 7, 48, 5));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 10, 16, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 9, 5, 48));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 12, 45, 45));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 11, 25, 46));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 14, 48, 16));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 13, 46, 25));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 16, 48, 16));
			allVariations.add(new Symbol(5, 2, 2, 4, 2, 15, 48, 5));
			allVariations.add(new Symbol(5, 2, 2, 4, 1, 1, 2, 48));

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(BodyBaseSymbol.LIMB_LENGTH_4.getIswaSymbol().getBaseSymbol())) {
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 1, 2, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 2, 3, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 3, 5, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 10, 4, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 9, 3, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 12, 9, 9));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 11, 6, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 6, 8, 4));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 5, 8, 6));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 8, 8, 4));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 7, 8, 3));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 14, 8, 4));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 13, 8, 6));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 16, 8, 4));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 15, 8, 3));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 3, 6, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 4, 9, 9));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 1, 3, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 2, 2, 4, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 11, 5, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 10, 3, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 9, 2, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 8, 8, 3));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 7, 8, 2));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 6, 8, 3));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 5, 8, 5));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 4, 8, 8));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 16, 8, 3));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 15, 8, 2));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 14, 8, 3));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 13, 8, 5));
			allVariations.add(new Symbol(5, 2, 3, 3, 1, 12, 8, 8));

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(BodyBaseSymbol.LIMB_LENGTH_5.getIswaSymbol().getBaseSymbol())) {
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 2, 10, 24));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 3, 14, 24));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 4, 22, 22));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 5, 24, 14));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 1, 5, 25));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 10, 7, 24));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 9, 2, 25));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 12, 22, 22));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 11, 13, 24));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 6, 24, 7));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 5, 24, 13));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 8, 24, 7));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 7, 25, 2));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 14, 24, 7));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 13, 24, 13));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 16, 24, 7));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 15, 25, 2));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 3, 13, 24));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 4, 22, 22));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 1, 2, 25));
			allVariations.add(new Symbol(5, 2, 2, 1, 1, 2, 7, 24));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 16, 24, 10));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 14, 24, 10));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 15, 25, 5));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 8, 24, 10));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 9, 5, 25));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 6, 24, 10));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 7, 25, 5));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 12, 22, 22));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 13, 24, 14));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 10, 10, 24));
			allVariations.add(new Symbol(5, 2, 2, 1, 2, 11, 15, 24));

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());

		} else if (getBaseSymbol().equals(BodyBaseSymbol.LIMB_LENGTH_6.getIswaSymbol().getBaseSymbol())) {
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 7, 16, 2));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 6, 16, 5));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 9, 2, 16));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 8, 16, 5));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 11, 8, 14));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 10, 5, 16));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 13, 14, 8));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 12, 12, 12));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 15, 16, 2));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 14, 16, 5));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 16, 16, 5));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 1, 4, 16));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 2, 7, 16));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 3, 10, 14));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 4, 13, 13));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 5, 14, 10));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 6, 16, 7));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 10, 7, 16));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 9, 4, 16));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 8, 16, 7));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 7, 16, 4));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 14, 16, 7));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 13, 14, 10));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 12, 13, 13));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 11, 10, 14));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 16, 16, 7));
			allVariations.add(new Symbol(5, 2, 3, 1, 2, 15, 16, 4));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 4, 12, 12));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 5, 14, 8));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 2, 5, 16));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 3, 8, 14));
			allVariations.add(new Symbol(5, 2, 3, 1, 1, 1, 2, 16));

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(BodyBaseSymbol.LIMB_LENGTH_7.getIswaSymbol().getBaseSymbol())) {
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 14, 12, 4));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 13, 10, 6));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 16, 12, 4));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 15, 12, 2));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 10, 4, 12));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 9, 2, 12));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 12, 10, 10));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 11, 6, 10));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 6, 12, 4));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 5, 10, 6));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 8, 12, 4));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 7, 12, 2));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 2, 6, 12));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 3, 8, 10));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 4, 11, 11));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 5, 10, 8));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 1, 4, 12));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 16, 12, 6));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 15, 12, 4));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 14, 12, 6));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 13, 10, 8));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 12, 11, 11));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 11, 8, 10));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 10, 6, 12));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 9, 4, 12));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 8, 12, 6));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 7, 12, 4));
			allVariations.add(new Symbol(5, 2, 3, 2, 2, 6, 12, 6));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 4, 10, 10));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 3, 6, 10));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 2, 4, 12));
			allVariations.add(new Symbol(5, 2, 3, 2, 1, 1, 2, 12));

			validVariations.clear();
			validVariations.addAll(allVariations);
			setFillAndRotation(getSymbol().getFill(), getSymbol().getRotation());
		} else if (getBaseSymbol().equals(BodyBaseSymbol.BREATH_EXHALE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() % 2 == 1) {
				newFill = getSymbol().getFill() - 2;
				newFill = newFill > 0 ? newFill : 5;
			} else {
				newFill = getSymbol().getFill() - 2;
				newFill = newFill > 0 ? newFill : 6;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.BREATH_INHALE.getIswaSymbol().getBaseSymbol())) {
			if (getSymbol().getFill() % 2 == 1) {
				newFill = getSymbol().getFill() - 2;
				newFill = newFill > 0 ? newFill : 5;
			} else {
				newFill = getSymbol().getFill() - 2;
				newFill = newFill > 0 ? newFill : 6;
			}
		}
		setFillAndRotation(newFill, newRotation);
	}
