import kotlin.coroutines.CoroutineContext

class PageStateContext(private val pageStateHandle: PageStageHandler) : CoroutineContext.Element {

    companion object PageKey : CoroutineContext.Key<PageStateContext>

    override val key: CoroutineContext.Key<*>
        get() = PageKey

    val page: Int = pageStateHandle.currentPage
}
