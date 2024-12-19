package kg.devcats.pdfviewer.library.subscaleview;

@SuppressWarnings("EmptyMethod")
public interface OnAnimationEventListener {

    void onComplete();

    void onInterruptedByUser();

    void onInterruptedByNewAnim();
}