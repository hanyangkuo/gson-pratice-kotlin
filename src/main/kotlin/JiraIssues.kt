class JiraTicker (
        val fields: Fields
)

class Fields (
        val project: Project,
        val summary: String,
        var reporter: String,
        val description: String,
        val issuetype: IssueType,
        val customField_21422: String,
        val customField_21424: String,
)

class Project (
        val key: String,
)
class IssueType (
        val name: String,
)