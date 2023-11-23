<script>
    let articles = $state([]);

    $effect(() => {
        fetch('http://localhost:8090/api/v1/articles')
            .then(response => response.json())
            .then(data => articles = data)
            .catch(error => console.error(error))

        setTimeout(() => {
            articles = [...articles, {title: 'New Article'}, {title: 'New Article'}];
        }, 1000);
    });
</script>

<ul>
    {#each articles as article}
        <li>{article.title}</li>
    {/each}
</ul>