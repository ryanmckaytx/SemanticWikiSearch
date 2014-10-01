# <b><em>AdvancedWikiSearch - A Semantic Web Application</em></b>

# <em>What is it</em>
This is a Semantic Web Application that allows you to search for any Company's profile. 
The Use Cases are
  <ol>
    <li>Enable Company Profile search by using 2 ways
        <ol>
          <li>Keyword search</li>
          <li>Multiple Options Search</li>
        </ol>
    </li>
    <li>Publish the Company Profile with Structured data by applying Semantic Markups</li>
    <li>Enable Client to extract/download the published Structured data</li>
  </ol>

# <em>What is it made of</em>
    <ol>
      <li>Data Access Layer
            <ol>
                <li>SPARQL to query <a href="http://dbpedia.org/sparql">http://dbpedia.org/sparql</a></li>
                <li>Apache Jena's ARQ library to build, fire and aggregate SPARQL queries</li>
            </ol>
      </li>
      <li>Presentation Layer
          <ol>
            <li>Spring Web MVC with ThemeLeaf templates</li>
            <li><a href="http://schema.org/">http://schema.org/</a> ontology to markup the web pages</li>
            <li>RDFa serialization format</li>
          </ol>
      </li>
      <li>RDFa Distiller (Yet to decided) to extract Structed data from the Web Page.</li>
    </ol>
