# GitCommitObject

A project to create Java Object Simulating Git Commit Object.

## Commit Object

When we call git commit, git creates a commit object which is also saved in git repository. A git commit object contains
the following attributes at the minimum

  1. Top-level tree for the snapshot of the project at that point.
  2. The parent commits if any
  3. The author/committer information
  4. Timestamp
  5. Commit Message

The simplified Commit object simulated by Commit class contains 
  
  1. **commitHash** - commit's SHA1 hash generated using commit message for simplification
  2. **tree** - Tree object to get the treeHash
  3. **author** - Author object which stores name and email address of author
  4. **committer** - Author object which stores name and email address of committer
  5. **message** - commit message
  6. **Timestamp** - timestamp storing current time
  
  
  **equals(Object o)** - compares two commit object on the basis of commitHash, treeHash and parent
  **hashCode()** - generates unique hashcode for each commit oject using commitHash, treeHash and parent
  
## Tree Object

A tree object in git data model contains one or more entries, each of which is the SHA-1 hash of a blob or 
subtree with its associated mode, type, and filename

The simplified Tree object simulated by Tree class contains
  
  1. **treeHash** - tree's SHA1 hash generated using commit message for simplification
  2. **files** - list of strings denoting files/commits present in that tree
  
  
