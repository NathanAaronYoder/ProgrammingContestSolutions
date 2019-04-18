def movingMinimum(arr, s):
    array = []
    for i in range(len(arr) + 1 - s ):
        lowest = arr[i]
        for j in range(s):
            if (arr[i + j] < arr[i]):
                lowest = arr[i + j]
        array.append(lowest)
    return array