package kg.devcats.pdfviewer.library.adapter;

class NullPdfErrorHandler implements PdfErrorHandler {
    @Override
    public void onPdfError(Throwable t) {
        /* Empty */
    }
}