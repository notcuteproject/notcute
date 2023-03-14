package io.notcute.util.signalslot;

/**
 * A float signal with 6 generic arguments.
 *
 * @param <A> The type of the first argument.
 * @param <B> The type of the second argument.
 * @param <C> The type of the third argument.
 * @param <D> The type of the forth argument.
 * @param <E> The type of the fifth argument.
 * @param <F> The type of the sixth argument.
 */
public class FloatSignal6<A, B, C, D, E, F> extends FunctionalFloatSignal<FloatSlot6<A, B, C, D, E, F>> {

	/**
	 * @see Signal#invoke(Object...)
	 */
	public float emit(A a, B b, C c, D d, E e, F f) {
		return super.emit(a, b, c, d, e, f);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected float actuateFloat(Slot<?> slot, Object... args) {
		if (slot instanceof DynamicFloatSlot) return ((DynamicFloatSlot) slot).accept(args);
		else if (slot instanceof FloatSlot6)  return  ((FloatSlot6<A, B, C, D, E, F>) slot).accept((A)args[0], (B)args[1], (C)args[2], (D)args[3], (E)args[4], (F)args[5]);
		else throw new IllegalArgumentException("Invalid slot type: " + slot.getClass());
	}

}
