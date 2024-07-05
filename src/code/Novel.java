/**
 * Novel
 *
 * @author Andres Arevalo, Marius Guerra & Raaz
 * @version 1.0
 */
public class Novel
{
    private final String title;
    private final String authorName;
    private final int    yearPublished;

    private static final int POSITIVE_NUMBER;

    static
    {
        POSITIVE_NUMBER = 0;
    }

    /**
     * Constructs a Novel with the specified title, author name, and year of publication.
     *
     * @param title the title of the novel
     * @param authorName the name of the author
     * @param yearPublished the year the novel was published
     * @throws IllegalArgumentException if the title or authorName is null or blank, or if yearPublished is negative
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        validateString(title);
        validateString(authorName);
        validateYearPublished(yearPublished);
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Validates the year of publication.
     *
     * @param yearPublished the year of publication to validate
     * @throws IllegalArgumentException if the yearPublished is less than 0
     */
    private static void validateYearPublished(final int yearPublished)
    {
        if(yearPublished < POSITIVE_NUMBER)
        {
            throw new IllegalArgumentException("Year published can't be less than POSITIVE_NUMBER");
        }
    }

    /**
     * Validates the given string.
     *
     * @param str the string to validate
     * @throws IllegalArgumentException if the string is null or blank
     */
    private static void validateString(final String str)
    {
        if(str == null || str.isBlank())
        {
            throw new IllegalArgumentException("String cannot be null or blank");
        }
    }

    /**
     * Returns the title of the novel.
     *
     * @return the title of the novel
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the name of the author of the novel.
     *
     * @return the name of the author of the novel
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Returns the year the novel was published.
     *
     * @return the year the novel was published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Returns a string representation of the novel.
     *
     * @return a string representation of the novel in the format "title by authorName, published in yearPublished."
     */
    @Override
    public String toString()
    {
        return String.format("%s by %s, published in %d.", title, authorName, yearPublished);
    }
}
