def find(s, ch): 
    """ Finds all indices of a character within a string """
    return sorted([i for i, ltr in enumerate(s) if ltr == ch])

def printList(l):
    for i in l: 
        print(i)

def orphanBackups(): 
    """
    Input: two lists separated by a line containing valid backup image 
    and file names respectively. Each name is listed on its own line. 

    Output: print all files with no index entries with an F preceding
    their name. Then print all index entries with no files with an I 
    preceding their name. Print each list in lexicographic order. 
    If there are no orphan files, print "No mismatches."
    """
    images = set()
    files = set() 

    emptyStrCount = 0
    lastEntry = ""

    while (emptyStrCount < 2):
        try: 
            lastEntry = input()
            if (lastEntry == ""): 
            emptyStrCount += 1
            continue
            if (emptyStrCount == 0): 
            images.add(lastEntry)
            else: 
            # Finds the last and second to last underscore in the string
            # so it can be split up by name, integer, and type
            indices = find(lastEntry, "_")
            last = indices[-1]
            secondLast = indices[-2]

            imageName = lastEntry[:secondLast]
            integer = lastEntry[secondLast:last]
            imageType = lastEntry[last:]
            files.add((imageName, integer, imageType))
        except:
            break

    orphanImages = list()
    orphanFiles = list()
    # Only the actual file names are relevant for comparision
    fileNames = {f[0] for f in files}

    for i in images:
        if i not in fileNames:
            orphanImages.append(i)

    for f in files:
        if f[0] not in images:
            orphanFiles.append(f[0] + f[1]  + f[2])

    orphanImages = sorted(["I " + iName for iName in orphanImages])
    orphanFiles = sorted(["F " + fName for fName in orphanFiles])

    if (len(orphanFiles) == 0 and len(orphanImages) == 0): 
        print("No mismatches.")
    else: 
        printList(orphanFiles)
        printList(orphanImages)

if __name__ == "__main__":
    orphanBackups()