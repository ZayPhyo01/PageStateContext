class PageStageHandler @Inject constructor() {
    var totalPage = 0
    var currentPage = 0

    fun resetCurrentPage() {
        currentPage = 0
    }

    fun increaseCurrentPage() {
        currentPage++
    }

    fun isReachLastPage(): Boolean = currentPage == totalPage
}
