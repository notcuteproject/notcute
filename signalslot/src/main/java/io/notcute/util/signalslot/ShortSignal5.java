package io.notcute.util.signalslot;

/**
 * A short signal with 5 generic arguments.
 *
 * @param <A> The type of the first argument.
 * @param <B> The type of the second argument.
 * @param <C> The type of the third argument.
 * @param <D> The type of the forth argument.
 * @param <E> The type of the fifth argument.
 */
public class ShortSignal5<A, B, C, D, E> extends FunctionalShortSignal<ShortSlot5<A, B, C, D, E>> {

	/**
	 * @see Signal#invoke(Object...)
	 */
	public short emit(A a, B b, C c, D d, E e) {
		return super.emit(a, b, c, d, e);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected short actuateShort(Slot<?> slot, Object... args) {
		if (slot instanceof DynamicShortSlot) return ((DynamicShortSlot) slot).accept(args);
		else if (slot instanceof ShortSlot5)  return  ((ShortSlot5<A, B, C, D, E>) slot).accept((A)args[0], (B)args[1], (C)args[2], (D)args[3], (E)args[4]);
		else throw new IllegalArgumentException("Invalid slot type: " + slot.getClass());
	}

}
