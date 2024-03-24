	public void mirror() {
		assert canMirror() : "Precondition failed: canMirrorHorizontal()";

		BaseSymbol baseSymbol = getSymbol().getBaseSymbol();
		int newFill = getSymbol().getFill();

		if (baseSymbol.equals(MouthBaseSymbol.TEETH_ON_LIPS.getIswaSymbol().getBaseSymbol())) {
			if (newFill == 3) {
				newFill = 4;
			} else {
				newFill = 3;
			}

			setFillAndRotation(newFill, getSymbol().getRotation());

		} else if (baseSymbol.equals(MouthBaseSymbol.MOUTH_SMILE.getIswaSymbol().getBaseSymbol())
				|| baseSymbol.equals(MouthBaseSymbol.MOUTH_SMILE_WRINKLED.getIswaSymbol().getBaseSymbol())
				|| baseSymbol.equals(MouthBaseSymbol.MOUTH_SMILE_OPEN.getIswaSymbol().getBaseSymbol())
				|| baseSymbol.equals(MouthBaseSymbol.MOUTH_FROWN.getIswaSymbol().getBaseSymbol())
				|| baseSymbol.equals(MouthBaseSymbol.MOUTH_FROWN_WRINKLED.getIswaSymbol().getBaseSymbol())
				|| baseSymbol.equals(MouthBaseSymbol.MOUTH_FROWN_OPEN.getIswaSymbol().getBaseSymbol())) {

			BaseSymbol newBaseSymbol = null;

			if (baseSymbol.getSymbol() == 2) {
				newBaseSymbol = new BaseSymbol(baseSymbol.getCategory(), baseSymbol.getGroup(),
						baseSymbol.getSymbol() + 1, baseSymbol.getVariation());
			} else {
				newBaseSymbol = new BaseSymbol(baseSymbol.getCategory(), baseSymbol.getGroup(),
						baseSymbol.getSymbol() - 1, baseSymbol.getVariation());
			}
			Symbol newSymbol = getMouthSymbolForBaseSymbolWithFillAndRotation(newBaseSymbol, getSymbol().getFill(),
					getSymbol().getRotation());
			setSymbol(newSymbol);

		} else if (baseSymbol.equals(MouthBaseSymbol.LIP_LOWER_OVER_UPPER.getIswaSymbol().getBaseSymbol())
				|| baseSymbol.equals(MouthBaseSymbol.LIP_UPPER_OVER_LOWER.getIswaSymbol().getBaseSymbol())) {

			BaseSymbol newBaseSymbol = null;

			if (baseSymbol.getVariation() == 2) {
				newBaseSymbol = new BaseSymbol(baseSymbol.getCategory(), baseSymbol.getGroup(), baseSymbol.getSymbol(),
						baseSymbol.getVariation() + 1);
			} else {
				newBaseSymbol = new BaseSymbol(baseSymbol.getCategory(), baseSymbol.getGroup(), baseSymbol.getSymbol(),
						baseSymbol.getVariation() - 1);
			}

			Symbol newSymbol = getMouthSymbolForBaseSymbolWithFillAndRotation(newBaseSymbol, getSymbol().getFill(),
					getSymbol().getRotation());
			setSymbol(newSymbol);

		}

	}
