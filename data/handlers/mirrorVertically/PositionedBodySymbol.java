	public void mirrorVertically() {
		int newRotation = getSymbol().getRotation();
		if (getBaseSymbol().equals(BodyBaseSymbol.HEAD_WITH_SHOULDERS_OR_NOSE.getIswaSymbol().getBaseSymbol())
				&& getSymbol().getFill() == 3) {
			if (getSymbol().getRotation() == 2) {
				newRotation = 4;
			} else if (getSymbol().getRotation() == 4) {
				newRotation = 2;
			}
		} else if (getBaseSymbol().equals(BodyBaseSymbol.BREATH_EXHALE.getIswaSymbol().getBaseSymbol())) {
			validVariations.clear();
			validVariations.add(new Symbol(4, 3, 7, 2, 3, 1, 7, 12));
			validVariations.add(new Symbol(4, 3, 7, 2, 2, 1, 11, 19));
			validVariations.add(new Symbol(4, 3, 7, 2, 4, 1, 7, 12));
			validVariations.add(new Symbol(4, 3, 7, 2, 1, 1, 11, 19));
			validVariations.add(new Symbol(4, 3, 7, 2, 5, 1, 6, 9));
			validVariations.add(new Symbol(4, 3, 7, 2, 6, 1, 6, 9));
		} else if (getBaseSymbol().equals(BodyBaseSymbol.BREATH_INHALE.getIswaSymbol().getBaseSymbol())) {
			validVariations.clear();
			validVariations.add(new Symbol(4, 3, 7, 1, 3, 1, 7, 12));
			validVariations.add(new Symbol(4, 3, 7, 1, 4, 1, 7, 12));
			validVariations.add(new Symbol(4, 3, 7, 1, 6, 1, 6, 9));
			validVariations.add(new Symbol(4, 3, 7, 1, 5, 1, 6, 9));
			validVariations.add(new Symbol(4, 3, 7, 1, 2, 1, 11, 19));
			validVariations.add(new Symbol(4, 3, 7, 1, 1, 1, 11, 19));
		}
		setFillAndRotation(getSymbol().getFill(), newRotation);
	}
